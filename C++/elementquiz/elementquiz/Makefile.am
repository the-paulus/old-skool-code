####### kdevelop will overwrite this part!!! (begin)##########
bin_PROGRAMS = elementquiz
elementquiz_SOURCES = elementquizfile.cpp elementquizview.cpp elementquizdoc.cpp elementquiz.cpp main.cpp 
elementquiz_LDADD   = -lqt -lXext -lX11 $(LIBSOCKET)

SUBDIRS = docs 

EXTRA_DIST = main.cpp elementquiz.cpp elementquiz.h elementquizdoc.cpp elementquizdoc.h elementquizview.cpp elementquizview.h resource.h elementquiz.xpm mini-elementquiz.xpm filenew.xpm filesave.xpm fileopen.xpm chem.key chem.key.1.txt a elementquizfile.cpp elementquizfile.h 

####### kdevelop will overwrite this part!!! (end)############


# set the include path for X, qt and KDE
INCLUDES= $(all_includes)

elementquiz_METASOURCES = AUTO

# the library search path. 
elementquiz_LDFLAGS = $(all_libraries) 

# them while "make clean", use CLEANFILES
DISTCLEANFILES = $(elementquiz_METASOURCES)




