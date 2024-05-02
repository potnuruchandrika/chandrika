<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dashboard page</title>
<style>
	#b{
		
		display:flex;
		flex-direction: row;
	    padding:50px;
	    justify-content:center;
	  
	    
	}
	.a{
		height: 50px;
		width:500px;
		margin-right: 16px;
		
		
	}
	
</style>
</head>
<body>
	<h2 style="text-align: center;">Welcome to PaymentApp</h2>
	<h3 style="text-align: center;">Welcome Chandrika Potnuru!</h3>
	<h4> primary bank account:</h4>
	<h5>account id:</h5>
	<h6>wallet balance:</h6>
	<div id="b">
	
          <button class="a">Add bank account</button>
           <button class="a">Transaction</button>
            <button class="a">Wallet Amount</button>
             <button class="a">Check Bank Balance</button>
              <button class="a">Bank Account List</button>
     </div>
</body>
</html>