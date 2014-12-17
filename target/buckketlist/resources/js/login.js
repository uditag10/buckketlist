$( document ).ready(function() {
    console.log( "ready!" );
    //alert("chal gaya");
    $("#welcomePageId").show();
    $("#userPageId").hide();
    $("#loginSubmit").click(function(){
    	//alert("inia gaye");
    	processLogin();
    	
    });
    $('#username').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processLogin();
        }
    });

    $('#pass').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processLogin();
        }
    });

    $("#registerSubmit").click(function(){
    	//alert("inia gaye");
    	userEmail = $("#registerUsername").val();
    	userPass = $("#registerPass").val();
    	name = $("#fullname").val();
    	phone = $("#phone").val();
    	valid = validateRegistration(phone,userEmail,userPass,name);
    	if(valid){
    		//alert(userEmail +" : "+ userPass);
    		getRegistration(userEmail,userPass,name,phone);
    	}
    });
    $('#registerUsername').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processRegistraion();
        }
    });
    $('#registerPass').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processRegistraion();
        }
    });
    $('#fullname').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processRegistraion();
        }
    });
    $('#phone').keypress(function(event) {
        if (event.keyCode == 13) {
            //alert('Entered');
        	processRegistraion();
        }
    });
    
});
function processLogin(){
	//alert("loginya lo");
	userEmail = $("#username").val();
	userPass = $("#pass").val();
	valid = validateLogin(userEmail,userPass);
	if(valid){
		//alert(userEmail +" : "+ userPass);
		getLogin(userEmail,userPass);
	}
}
function processRegistraion(){
	
	userEmail = $("#registerUsername").val();
	userPass = $("#registerPass").val();
	name = $("#fullname").val();
	phone = $("#phone").val();
	valid = validateRegistration(phone,userEmail,userPass,name);
	if(valid){
		//alert(userEmail +" : "+ userPass);
		getRegistration(userEmail,userPass,name,phone);
	}
}
function validateLogin(x,y) {
    //var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
    if (y.length<6 ) {
        alert("min 6 character password");
        return false;
    }
    
   return true;
}
function validateRegistration(w,x,y,z) {
    //var x = document.forms["myForm"]["email"].value;
	var phno = parseInt(w);
	//alert(isNaN(phno)+":"+ w.length );
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
    if (y.length<6 ) {
        alert("min 6 character password");
        return false;
    }
    if (isNaN(phno) || w.length !=10 ) {
        alert("Not a valid phone");
        return false;
    }
    if (z.length<1 ) {
        alert("plz enter your name");
        return false;
    }
    
   return true;
}
function getLogin(a,b){
	url = "/buckketlist/login?username="+a+"&passkey="+b;
	$.get(url,
	    	  function(data,status){
	    	    //alert("Data: " + data.username + "\nStatus: " + status);
		dataProcess(data,false);
		$("#errorDiv").html();
	    	  });
}
function getRegistration(a,b,c,d){
	url = "/buckketlist/registration?username="+a+"&passkey="+b+"&name="+c+"&phone="+d;
	$.get(url,
	    	  function(data,status){
		dataProcess(data,true);
	    	    //alert("Data: " + data.username + "\nStatus: " + status);
	    	  });
}
function dataProcess(data,firstUser){
	//alert(data.errorMsg);
	if(data.errorMsg){
		$("#errorDiv").html(data.errorMsg);
	}else{
		 $("#welcomePageId").hide();
		    $("#userPageId").show();
		    $("#welcomeMsgId").html(" Welcome "+data.username);
		    $("#userIdHidden").val(data.userId);
		    if(firstUser){
		    	
		    }
		    
	}
	
	$("#errorDiv").html();
}