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

				<form method="post" action="signup">
					<div class="form-group">
						<label for="exampleInputPassword1">Username</label> 
						<input
							type="text" name="username" class="form-control" id="exampleInputPassword1">
					</div>
				
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> 
						<input
							type="password" name="password" class="form-control" id="exampleInputPassword1">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1">Confirm Password</label> 
						<input
							typ+e="password" name="cpassword" class="form-control" id="exampleInputPassword1">
					</div>
					
					
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" name="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp"> 
					</div>
					
					
					<div class="form-group">
						<label for="exampleInputPassword1">Mobile</label> 
						<input
							type="text" name="mobile" class="form-control" id="exampleInputPassword1">
					</div>
					
					
					<div class="form-group">
						<label for="exampleInputPassword1">City</label> 
						<input
							type="text" name="city" class="form-control" id="exampleInputPassword1">
					</div>
					
					<div>
					<select name="roll_id">
					<option value=-1>type </option>
					<option value=1>Farmer </option>
					<option value=2>Customer </option>
				    <option value=3>Admin </option> 
					
					
					</select>
					
					</div>
					<br>
					
					<div><button type="submit" class="btn btn-primary">Submit</button>
					<a href="signin">              Login here</a></div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>