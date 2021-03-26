SRCDIR = src
BUILDDIR = build
PKGDIR = de/dhbw/graphen
PKG = de.dhbw.graphen
MAINCLASS = Main
SOURCES = Main.java GraphInterface.java Graph.java Knoten.java
CLASSES := $(patsubst %.java, %.class, $(SOURCES))
SOURCEFILES := $(patsubst %.java, $(SRCDIR)/$(PKGDIR)/%.java, $(SOURCES))

run: all
	cd $(BUILDDIR) && java $(PKG).$(MAINCLASS)

all:
	javac -d $(BUILDDIR) $(SOURCEFILES)

clean:
	rm -rf $(BUILDDIR)
