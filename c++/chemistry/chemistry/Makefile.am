####### kdevelop will overwrite this part!!! (begin)##########
bin_PROGRAMS = chemistry
chemistry_SOURCES = chemistryview.cpp chemistrydoc.cpp chemistry.cpp main.cpp 
chemistry_LDADD   =  -lqt -lXext -lX11 $(LIBSOCKET)

SUBDIRS = docs 

EXTRA_DIST = main.cpp chemistry.cpp chemistry.h chemistrydoc.cpp chemistrydoc.h chemistryview.cpp chemistryview.h resource.h chemistry.xpm mini-chemistry.xpm filenew.xpm filesave.xpm fileopen.xpm 

####### kdevelop will overwrite this part!!! (end)############


# set the include path for X, qt and KDE
INCLUDES= $(all_includes)

chemistry_METASOURCES = AUTO

# the library search path. 
chemistry_LDFLAGS = $(all_libraries) 

# them while "make clean", use CLEANFILES
DISTCLEANFILES = $(chemistry_METASOURCES)




