
function checkPassword()
{
 if( document.getElementById("psw").value!=document.getElementById("confirmpsw").value)
 {
   alert("password not matched");
   return false;

 }
 else{
   alert("success");
   return true;
 }
}

function enableButton()
{
  if(document.getElementById("checkbox").checked)
  {
    document.getElementById("submitbtn").disabled=false;
  }
  else{
    document.getElementById("submitbtn").disabled=true;
  }
}

