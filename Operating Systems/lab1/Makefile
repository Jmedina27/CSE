all : demo

main.o : main.cpp functions.h
	g++ -c -g main.cpp

functions.o: functions.cpp functions.h 
	g++ -c -g functions.cpp

demo : main.o functions.o
	g++ main.o functions.o -o demo

# Testing
check : all
	./demo

run :
	./demo

# Clean up 
clean:
	rm -f *.o demo
