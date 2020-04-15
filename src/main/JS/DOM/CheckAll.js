/**
* 全选 全不选 反选

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
        <title>Insert title here</title>
        <script type="text/javascript">
            // window.onload =function() {
            var qx = document.getElementById("qx");
            var qbx = document.getElementById("qbx");
            var fx = document.getElementById("fx");


            var arr = document.getElementsByName("ck");
            qx.onclick = function(){
            for (var i in arr){
            arr[i].checked=true;
        }
        }

            qbx.onclick = function(){
            for (var i in arr){
            arr[i].checked=false;
        }
        }

            fx.onclick = function(){
            for(var i in arr){
            if(arr[i].checked){
            arr[i].checked=false;
        }else{
            arr[i].checked=true;
        }
        }

        }
        }

        </script>
</head>
<body>

<button id="qx">全选</button>
<button id="qbx">全不选</but ton>
<button id="fx">反选</button></br>

<input type="checkbox" name="ck">
    <input type="checkbox" name="ck">
        <input type="checkbox" name="ck">
            <input type="checkbox" name="ck">
                <input type="checkbox" name="ck">
                    <input type="checkbox" name="ck">
                        <input type="checkbox" name="ck">
                            <input type="checkbox" name="ck">
                                <input type="checkbox" name="ck">

                                </body>
</html>

 */