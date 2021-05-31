<html>
<head>
</head>
<body>
<?php
class ArrShort{
    function __construct($Myarray){
        echo "<h3>Array before Sorting <br>";
        print_r($Myarray);
        sort($Myarray);
        echo "<br><br>Array After Sorting <br>";
        print_r($Myarray);
        
    }
}
$Myarray = array(12,5,7,89,-1,10,-10,);
$ob = new ArrShort($Myarray);

?>
</body>
</html>