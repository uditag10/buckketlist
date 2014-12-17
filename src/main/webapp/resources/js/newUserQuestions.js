$( document ).ready(function() {

	$("#cbstart").show();
    $("#cbQuestin1").hide();
    $("#cbQuestin2").hide();
    $("#cbQuestin3").hide();
    $("#cbQuestin4").hide();
    $("#cbQuestin5").hide();
    $("#cbQuestin6").hide();
    $("#cbQuestin7").hide();
    $("#cbQuestin8").hide();
    $("#cbQuestin9").hide();
    $("#cbQuestin10").hide();
    $("#cbFinal").hide();

    var quesNo = 1;
    var finalBL ="";
    $("#noCBReady").click(function(){
    	$("#cbstart").hide();
        $("#cbQuestin1").show();
    });
    $("#yesCBReady").click(function(){
    	$("#cbstart").hide();
        $("#cbFinal").show();
        finalBL = finalBL + "<input type='text' name='createBLText"+quesNo+"'/><select id = 'cat10'><option value=''>Category</option> </select><br>";
        finalBL = finalBL + "<input type='text' name='createBLText"+quesNo+"'/><select id = 'cat10'><option value=''>Category</option> </select><br>";
        finalBL = finalBL + "<input type='text' name='createBLText"+quesNo+"'/><select id = 'cat10'><option value=''>Category</option> </select><br>";
        $("#buckets").html(finalBL);
    });

    $(".BLans").click(function(){
    	hideDiv = "#cbQuestin"+ quesNo;
    	textval = "#ans"+ quesNo;
    	catVal = "#cat"+ quesNo;
    	finalBL = finalBL + "<input type='text' name='createBLText"+quesNo+"' value='"+$(textval).val()+"'/><input type='text' name='category"+quesNo+"' value='"+$(catVal).val()+"'/><br>";
    	
    	if(quesNo<10){
    		showDiv = "#cbQuestin"+ ++quesNo;
        	$(hideDiv).hide();
            $(showDiv).show();
    	}else{
    		$("#cbQuestin10").hide();
    		$("#cbFinal").show();
    		$("#buckets").html(finalBL);
    	}
    	
    });
});
