####### kdevelop will overwrite this part!!! (begin)##########
bin_PROGRAMS = quickbackup
quickbackup_SOURCES = cdirlistview.cpp cfilebrowse.cpp cdirectorynode.cpp quickbackupview.cpp quickbackupdoc.cpp quickbackup.cpp main.cpp 
quickbackup_LDADD   =  -lqt -lXext -lX11 $(LIBSOCKET)

SUBDIRS = docs 

EXTRA_DIST = main.cpp quickbackup.cpp quickbackup.h quickbackupdoc.cpp quickbackupdoc.h quickbackupview.cpp quickbackupview.h resource.h quickbackup.xpm mini-quickbackup.xpm filenew.xpm filesave.xpm fileopen.xpm cdirectorynode.cpp cdirectorynode.h cfilebrowse.cpp cfilebrowse.h cdirlistview.cpp cdirlistview.h 

####### kdevelop will overwrite this part!!! (end)############


# set the include path for X, qt and KDE
INCLUDES= $(all_includes)

quickbackup_METASOURCES = AUTO

# the library search path. 
quickbackup_LDFLAGS = $(all_libraries) 

# them while "make clean", use CLEANFILES
DISTCLEANFILES = $(quickbackup_METASOURCES)




