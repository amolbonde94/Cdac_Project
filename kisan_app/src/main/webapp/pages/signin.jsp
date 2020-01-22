<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-3"></div>
			
			
			<div class="col-6">
			
				<form method="post" action="signin">
				
					<div class="form-group">
						<label for="exampleInputPassword1">Username</label> 
						<input
							type="text" name="username" class="form-control" id="exampleInputPassword1">
					</div>
					
					
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> 
						<input
							type="text" name="password" class="form-control" id="exampleInputPassword1">
					</div>
					
					
					<button type="submit" class="btn btn-primary">LOGIN</button>
					<a href="signup">Create New Account</a>
				</form>
			
			</div>
		</div>
	</div>


</body>
</html>