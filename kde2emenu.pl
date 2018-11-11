#per/usr/bin/perl 

$HOME = "/home/lordchaos";
$KDEMENUDIR = "/.kde/share/applnk";
$KDEMENU = $HOME . $KDEMENUDIR;
chdir($KDEMENU); #if this isn't the correct path to the KDE menu directory
print("\n$KDEMENU\n");

