# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = I:\JetBrains\Toolbox\apps\CLion\ch-0\192.6817.32\bin\cmake\win\bin\cmake.exe

# The command to remove a file.
RM = I:\JetBrains\Toolbox\apps\CLion\ch-0\192.6817.32\bin\cmake\win\bin\cmake.exe -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/P1161.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/P1161.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/P1161.dir/flags.make

CMakeFiles/P1161.dir/main.c.obj: CMakeFiles/P1161.dir/flags.make
CMakeFiles/P1161.dir/main.c.obj: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/P1161.dir/main.c.obj"
	"I:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin\gcc.exe" $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\P1161.dir\main.c.obj   -c I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\main.c

CMakeFiles/P1161.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/P1161.dir/main.c.i"
	"I:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin\gcc.exe" $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\main.c > CMakeFiles\P1161.dir\main.c.i

CMakeFiles/P1161.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/P1161.dir/main.c.s"
	"I:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin\gcc.exe" $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\main.c -o CMakeFiles\P1161.dir\main.c.s

# Object files for target P1161
P1161_OBJECTS = \
"CMakeFiles/P1161.dir/main.c.obj"

# External object files for target P1161
P1161_EXTERNAL_OBJECTS =

P1161.exe: CMakeFiles/P1161.dir/main.c.obj
P1161.exe: CMakeFiles/P1161.dir/build.make
P1161.exe: CMakeFiles/P1161.dir/linklibs.rsp
P1161.exe: CMakeFiles/P1161.dir/objects1.rsp
P1161.exe: CMakeFiles/P1161.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable P1161.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\P1161.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/P1161.dir/build: P1161.exe

.PHONY : CMakeFiles/P1161.dir/build

CMakeFiles/P1161.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\P1161.dir\cmake_clean.cmake
.PHONY : CMakeFiles/P1161.dir/clean

CMakeFiles/P1161.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161 I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161 I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug I:\Github\URI-Online-Judge-Solutions\Mathematics\P1161\cmake-build-debug\CMakeFiles\P1161.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/P1161.dir/depend

