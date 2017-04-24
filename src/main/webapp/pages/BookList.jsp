<%--
  Created by IntelliJ IDEA.
  User: 林漠
  Date: 2017/4/23
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<style type="text/css">

    #table-2 {

        border: 1px solid #e3e3e3;

        background-color: #f2f2f2;

        width: 100%;

        border-radius: 6px;

        -webkit-border-radius: 6px;

        -moz-border-radius: 6px;

    }



    #table-2 td, #table-2 th {

        padding: 5px;

        color: #333;

    }



    #table-2 thead {

        font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;

        padding: .2em 0 .2em .5em;

        text-align: left;

        color: #4B4B4B;

        background-color: #C8C8C8;

        background-image: -webkit-gradient(linear, left top, left bottom, from(#f2f2f2), to(#e3e3e3), color-stop(.6, #B3B3B3));

        background-image: -moz-linear-gradient(top, #D6D6D6, #B0B0B0, #B3B3B3 90%);

        border-bottom: solid 1px #999;

    }



    #table-2 th {

        font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;

        font-size: 17px;

        line-height: 20px;

        font-style: normal;

        font-weight: normal;

        text-align: left;

        text-shadow: white 1px 1px 1px;

    }



    #table-2 td {

        line-height: 20px;

        font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;

        font-size: 14px;

        border-bottom: 1px solid #fff;

        border-top: 1px solid #fff;

    }



    #table-2 td:hover {

        background-color: #fff;

    }

</style>

<!DOCTYPE html>

<html>

<head>

    <title>Books</title>

</head>

<body>

<form action="find" method="post">

    Input book title: <input type="text" name="title" value=""/>

    <input type="submit" value="find"/>

</form>



<table id="table-2">

    <thead>

    <tr>

        <th>ISBN</th>

        <th>Title</th>

        <th>Author</th>

        <th>Price</th>

        <th>Publisher</th>

        <th>Source</th>

        <th>Quantity</th>

    </tr>

    </thead>

    <tbody>

    <c:forEach items="${books}" var="var">

        <c:if test="${var.number_on_hand > 5}">

            <tr>

                <td>${var.isbn}</td>

                <td>${var.title}</td>

                <td><a href="

  <c:url value="author">

  <c:param name="author" value="${var.author_name}"></c:param>

  </c:url>

">${var.author_name}</a></td>

                <td>${var.retail_price}</td>

                <td><a href="<c:url value="publisher">

  <c:param name="publisher" value="${var.publisher_name}"></c:param>

</c:url> ">${var.publisher_name}</a></td>

                <td>${var.source_numb}</td>

                <td>${var.number_on_hand}</td>

            </tr>

        </c:if>

        <c:if test="${var.number_on_hand <= 5}">

            <tr bgcolor="lime">

                <td>${var.isbn}</td>

                <td>${var.title}</td>

                <td><a href="

  <c:url value="author">

  <c:param name="author" value="${var.author_name}"></c:param>

  </c:url>

">${var.author_name}</a></td>

                <td>${var.retail_price}</td>

                <td><a href="<c:url value="publisher">

  <c:param name="publisher" value="${var.publisher_name}"></c:param>

</c:url> ">${var.publisher_name}</a></td>

                <td>${var.source_numb}</td>

                <td>${var.number_on_hand}</td>

            </tr>

        </c:if>

    </c:forEach>
    </tbody>
</table>

</body>

</html>