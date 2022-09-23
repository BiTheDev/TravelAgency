<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.3.0/mdb.min.css"
  rel="stylesheet"
  />

<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<title>Reviews</title>
</head>
<body>
<nav class="navbar navbar-expand-lg sticky-top navbar-light bg-light">
  <!-- Container wrapper -->
  <div class="container-fluid">
    <!-- Toggle button -->
    <button
      class="navbar-toggler"
      type="button"
      data-mdb-toggle="collapse"
      data-mdb-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <i class="fas fa-bars"></i>
    </button>

    <!-- Collapsible wrapper -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <!-- Navbar brand -->
      <a class="navbar-brand mt-2 mt-lg-0" href="/AirbnbSeattle">
        Seattle Traveler
      </a>
      <!-- Left links -->
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      	<li class="nav-item">
          <a class="nav-link" href="findusers">Search User</a>
        </li>
      </ul>
      <!-- Left links -->
    </div>
    <!-- Collapsible wrapper -->
  </div>
  <!-- Container wrapper -->
</nav>
	<div class="container" style=" width:50vw; margin-top:2vw; height:100vh; overflow-y:scroll;">
	<h1 style="text-align:center;">${messages.title}</h1>
        <table border="1" class="table align-middle mb-0 bg-white" style="width:50vw; margin-top:2vw;">
        	<thead class="bg-light">
            <tr>
                <th>ReviewId</th>
                <th>UserId</th>
                <th>UserName</th>
                <th>Created</th>
                <th>Content</th>
                <th>ListingId</th>
            </tr>
            <c:forEach items="${reviews}" var="review" >
                <tr>
                    <td><c:out value="${review.getReviewId()}" /></td>
                    <td><c:out value="${review.getUserId()}" /></td>
                    <td><c:out value="${review.getUsername()}" /></td>
                    <td><fmt:formatDate value="${review.getCreated()}" pattern="MM-dd-yyyy hh:mm:sa"/></td>
                    <td><c:out value="${review.getContent()}" /></td>
                    <td><c:out value="${review.getListingId()}" /></td>
                </tr>
            </c:forEach>
       </table>
       </div>
</body>
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.3.0/mdb.min.js"
></script>
</html>
