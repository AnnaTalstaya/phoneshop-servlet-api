<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Anna
  Date: 13.12.2018
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>


<tags:master pageTitle="Cart">
    <jsp:useBean id="cart" type="com.es.phoneshop.model.cart.Cart" scope="session"/>

    <form method="post" action="${pageContext.servletContext.contextPath}/cart">

        <br>
        <table>
            <thead>
            <tr>
                <td>Image</td>
                <td>Code</td>
                <td>Description</td>
                <td class="price">Price</td>
                <td class="number">Quantity</td>
                <td></td>
            </tr>
            </thead>
            <c:forEach var="item" items="${cart.cartItems}">
                <tr>
                    <td>
                        <a href="${pageContext.servletContext.contextPath}/products/${item.product.id}">
                            <img class="product-tile"
                                 src="https://raw.githubusercontent.com/andrewosipenko/phoneshop-ext-images/master/${item.product.imageUrl}">
                        </a>
                    </td>
                    <td>${item.product.code}</td>
                    <td>${item.product.description}</td>
                    <td class="price"><fmt:formatNumber value="${item.product.price}"
                                                        type="currency"
                                                        currencySymbol="${item.product.currency.symbol}"/>
                    </td>
                    <td>
                        <input name="quantity"
                               value="${not empty quantityErrors[item.product.id] ? paramValues['quantity'][status.index]:item.quantity}"
                               class="number">
                        <input type="hidden" name="productId" value="${item.product.id}"/>
                        <c:if test="${not empty quantityError[item.product.id]}">
                            <p class="error">${quantityError[item.product.id]}</p>
                        </c:if>
                    </td>
                    <td>
                        <button formaction="${pageContext.servletContext.contextPath}/cart/delete/${item.product.id}">
                            Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td></td>
                <td>Total:</td>
                <td>${cart.totalPrice}</td>
            </tr>
        </table>

        <c:if test="${not empty cart.cartItems}">
            <button>Update cart</button>
            <a href="<c:url value="/checkout"/>">Checkout</a>
        </c:if>
    </form>
</tags:master>
