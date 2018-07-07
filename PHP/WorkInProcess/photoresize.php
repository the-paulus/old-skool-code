<?php
# // Content type
# header('Content-type: image/png');
#
# $file = "/home/paulus/public_html/header_02.jpg";
# $width = 200;
# $height = 200;

# // Get new dimensions
# list($width_orig, $height_orig) = getimagesize($filename);
# 
# if ($width && ($width_orig < $height_orig)) {
#    $width = ($height / $height_orig) * $width_orig;
# } else {
#    $height = ($width / $width_orig) * $height_orig;
# }
# 
# // Resample
# $image_p = imagecreatetruecolor($width, $height);
# $image = imagecreatefromjpeg($filename);
# imagecopyresampled($image_p, $image, 0, 0, 0, 0, $width, $height, $width_orig, $height_orig);
# 
# // Output
# imagejpeg($image_p, null, 100);

header("Content-type: image/png");
$string = $_GET['text'];
$im    = imagecreatefrompng("button.png");
$orange = imagecolorallocate($im, 220, 210, 60);
$px    = (imagesx($im) - 7.5 * strlen($string)) / 2;
imagestring($im, 3, $px, 9, $string, $orange);
imagepng($im);
imagedestroy($im);
?>