<?php

if( isset($_REQUEST["MAX_FILE_SIZE"]) )
{
	$uploaddir = "/tmp/paulslinuxbox/"; # make sure that the directory exists and that the permissions are correct. Using 0777 on the directory will work but obviously not very secure.
	$uploadfile = $uploaddir . basename($_FILES['userfile']['name']);

	print("<pre>");

	echo "<br/>" . $_FILES['userfile']['tmp_name'];
	echo "<br/>" . $uploadfile;

	if( move_uploaded_file($_FILES['userfile']['tmp_name'], $uploadfile)) {
   		echo "File is valid, and was successfully uploaded.\n";
	} else {
   		echo "Possible file upload attack!\n";
	}

	echo 'Here is some more debugging info:';
	print_r($_FILES);

	print "</pre>";
}

print('<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">');
print('<html>');

print('<head>');
  print('<title>File Upload</title>');
  print('<meta name="GENERATOR" content="Quanta Plus">');
  print('<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">');
print('</head>');
print('<body>');
print('<!-- The data encoding type, enctype, MUST be specified as below -->');
print('<form enctype="multipart/form-data" action="' . $_SERVER["PHP_SELF"] . '" method="POST">');
    print('<!-- MAX_FILE_SIZE must precede the file input field -->');
    print('<input type="hidden" name="MAX_FILE_SIZE" value="50000" />');
    print('<!-- Name of input element determines name in $_FILES array -->');
    print('Send this file: <input name="userfile[]" type="file" />');
    print('<br/>Send this file: <input name="userfile[]" type="file" />');
    print('<input type="submit" value="Send File" />');
print('</form>');

print('</body>');
print('</html>');
?>