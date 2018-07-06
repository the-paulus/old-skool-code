####### kdevelop will overwrite this part!!! (begin)##########
bin_PROGRAMS = brestore
brestore_SOURCES = brestoreview.cpp brestoredoc.cpp brestore.cpp main.cpp 
brestore_LDADD   =  -lqt -lXext -lX11 $(LIBSOCKET)

SUBDIRS = docs 

EXTRA_DIST = main.cpp brestore.cpp brestore.h brestoredoc.cpp brestoredoc.h brestoreview.cpp brestoreview.h resource.h brestore.xpm filenew.xpm filesave.xpm fileopen.xpm 

####### kdevelop will overwrite this part!!! (end)############


# set the include path for X, qt and KDE
INCLUDES= $(all_includes)

brestore_METASOURCES = AUTO

# the library search path. 
brestore_LDFLAGS = $(all_libraries) 

# them while "make clean", use CLEANFILES
DISTCLEANFILES = $(brestore_METASOURCES)




