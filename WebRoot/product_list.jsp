<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>bookStore列表</title>
<%--导入css --%>
<link rel="stylesheet" href="css/main.css" type="text/css" />
</head>

<body class="main">

	<jsp:include page="head.jsp" />
	<jsp:include page="menu_search.jsp" />

	<div id="divpagecontent">
		<table width="100%" border="0" cellspacing="0">
			<tr>

				<td>
					<div style="text-align:right; margin:5px 10px 5px 0px">
						<a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;计算机&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;图书列表
					</div>

					<table cellspacing="0" class="listcontent">
						<tr>
							<td>
								<h1>商品目录</h1>
								<hr />
								<h1>计算机</h1>&nbsp;&nbsp;&nbsp;&nbsp;共100种商品
								<hr />
								<div style="margin-top:20px; margin-bottom:5px">
									<img src="images/productlist.gif" width="100%" height="38" />
								</div>
								<table cellspacing="0" class="booklist">
									<tr>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/101.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/102.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/103.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/104.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>


									</tr>
								</table>

								<table cellspacing="0" class="booklist">
									<tr>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/101.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/102.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/103.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>
										<td>

											<div class="divbookpic">
												<p>
													<a href="product_info.jsp"><img src="bookcover/104.jpg" width="115"
														height="129" border="0" /> </a>
												</p>
											</div>

											<div class="divlisttitle">
												<a href="product_info.jsp">书名:xxx<br />售价:xxx </a>
											</div></td>


									</tr>
								</table>















								<div class="pagination">
									<ul>


										<li class="disablepage">上一页 &lt;&lt;</li>
										<li class="currentpage">1</li>
										<li><a href="product_info.jsp">2</a>
										</li>
										<li><a href="product_info.jsp">3</a>
										</li>
										<li><a href="product_info.jsp">4</a>
										</li>


										<li class="nextpage"><a href="product_info.jsp">下一页&gt;&gt;</a>
										</li>

									</ul>
								</div>
							</td>
						</tr>
					</table></td>
			</tr>
		</table>
	</div>



	<jsp:include page="foot.jsp" />


</body>
</html>
