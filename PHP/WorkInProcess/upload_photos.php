<?php
include("../global.php");
include("../admin/admin_include.php");				################### Modify this accordingly!!!!
print_top_of_page($IMAGE_DIRECTORY);

if($_REQUEST["MAX_FILE_SIZE"])
{
	mysql_connect("localhost", "root","");    ############## Change this!
	mysql_select_db("paulslinuxbox");	######## and this!
	$rs = mysql_query("SELECT id,album_name FROM TblAlbums WHERE id=".$_REQUEST["album_name"]);
	$row=mysql_fetch_array($rs,MYSQL_ASSOC);
	$upload_dir = "/tmp/paulslinuxbox.net/";		######### Change this!!!!
		
	for($ctr=0; $ctr<count($_FILES['user_files']['name']);$ctr++)
	{
		$upload_file = $upload_dir . basename($_FILES['user_files']['name'][$ctr]);
		
		if(move_uploaded_file($upload_file, "/home/paulus/public_html/photos/" . $row["album_name"] . "/" . basename($_FILES['user_files']['name'][$ctr])))
		{
			print('<br/><font color="lime"><b>' . $_FILES['user_files']['name'][$ctr] . '</b></font> - uploaded successfully!');
		}
		else
		{
			print('<br/><font color="red"><b>' . $_FILES['user_files']['name'][$ctr] . '</b></font> - upload failed!');
		}

		mysql_query("INSERT INTO TblPhotos() VALUES()"); ########### Modify this query!
	}
}
?>
		<td valign="top" colspan="1">
			<?php include("../admin/admin_left.php"); ################### Modify this accordingly!!!!?>
		</td> <!-- Navigation panel -->
		<td valign="top" colspan="1" width="100%">
		<table width="75%">
		<tr>
		<td colspan="2">Select the Maxium number of files to upload at one time:</td>
		<td>
		<form name="number_of_files" action="<?php echo $_SERVER["PHP_SELF"]; ?>" method="POST">
			<SELECT name="num_files" onchange="form.submit()">
     				<?php
				for($ctr=1;$ctr<=25;$ctr++)
				{
					if(isset($_REQUEST["num_files"]) && ($ctr == $_REQUEST["num_files"]))
					{
						print('<option value="' . $ctr . '" selected="true">' . $ctr . '</option>');
					}
					else
					{
						print('<option value="' . $ctr . '">' . $ctr . '</option>');
					}
				}
				?>
   			</SELECT>
		</form>
		</td>
		</tr>
		<form name="upload_files" enctype="multipart/form-data" action="<?php echo $_SERVER["PHP_SELF"]; ?>" method="POST">
		<input type="hidden" name="MAX_FILE_SIZE" value="30000" />
		<tr>
		<TD colspan="2">Select the album that these pictures will belong to: </TD>
		<td><SELECT name="album_name">
        		<?php
				#mysql_connect(MYSQL_HOST, MYSQL_USER_ADMIN, MYSQL_PASSWORD_ADMIN);
				mysql_connect("localhost", "root", "") or die(mysql_error());
				#mysql_select_db(DBNAME);
				mysql_select_db("paulslinuxbox") or die(mysql_error());
				
				$query = "SELECT id,album_name FROM TblAlbums";

				$rs = mysql_query($query);
				
				for($ctr=0;$ctr<mysql_num_rows($rs);$ctr++)
				{
					$row = mysql_fetch_array($rs, MYSQL_ASSOC);
					print('<option value="' . $row["id"] . '">' . $row["album_name"] . '</option>');
				}
				mysql_close();
			?>
      		</SELECT>
		</td>
		</tr>
		<tr>
		<TD align="center"><font size="+1"><b>Photo Number</b></font></TD>
		<TD align="center"><font size="+1"><b>File</b></font></TD>
		<TD align="center"><font size="+1"><b>Title</b></font></TD>
		</tr>
		<tr>
			<?php
				($_REQUEST["num_files"]) ? $upload_num_files = $_REQUEST["num_files"] : $upload_num_files = 1;
				for($ctr=1; $ctr<$_REQUEST["num_files"]+1;$ctr++)
				{
					print('<tr align="center">');
					print('<td>' . $ctr . '</td>');
					print('<td><input type="file" name="user_files[]"></td>');
					print('<td><input type="text" name="user_files_title[]"></td>');
					print('</tr>');
					#print('<tr>');
					#print('<td>Title: </td>');
					#print('<td><input type="text" name="user_files_title[]"></td>');
					#print('</tr>');
					#print('<tr>');
					#print('<td>Description:</td>');
					#print('<td><textarea name="user_files_description[]" rows="10" cols="30"></textarea></td>');
					#print('</tr>');
				}
			?>
		</table>
		<center>
		<INPUT type="submit" name="submit_files" value="Upload Files">
		</form>
		</center>
		</td>
</tr>
</table>
</body>
</html>