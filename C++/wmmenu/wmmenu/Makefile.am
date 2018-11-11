####### kdevelop will overwrite this part!!! (begin)##########
bin_PROGRAMS = wmmenu
wmmenu_SOURCES = wmmenuview.cpp wmmenudoc.cpp wmmenu.cpp main.cpp 
SOURCES = wmmenuview.cpp wmmenudoc.cpp wmmenu.cpp main.cpp 
INTERFACES = 
TRANSLATIONS = 
KDE_OPTIONS = qtonly
wmmenu_LDADD   =  -lqt -lXext -lX11 $(LIBSOCKET)

SUBDIRS = docs 

EXTRA_DIST = main.cpp wmmenu.cpp wmmenu.h wmmenudoc.cpp wmmenudoc.h wmmenuview.cpp wmmenuview.h lo32-app-wmmenu.png lo16-app-wmmenu.png filenew.xpm filesave.xpm fileopen.xpm 

####### kdevelop will overwrite this part!!! (end)############


# set the include path for X, qt and KDE
INCLUDES= $(all_includes)

wmmenu_METASOURCES = AUTO

# the library search path. 
wmmenu_LDFLAGS = $(all_libraries) 

# them while "make clean", use CLEANFILES
DISTCLEANFILES = $(wmmenu_METASOURCES)

# this is to enable Qt behavoir of am_edit
KDE_OPTIONS = qtonly



