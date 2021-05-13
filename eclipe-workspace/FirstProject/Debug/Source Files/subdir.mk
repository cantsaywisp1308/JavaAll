################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../Source\ Files/main.c \
../Source\ Files/variables.c 

OBJS += \
./Source\ Files/main.o \
./Source\ Files/variables.o 

C_DEPS += \
./Source\ Files/main.d \
./Source\ Files/variables.d 


# Each subdirectory must supply rules for building sources it contributes
Source\ Files/main.o: ../Source\ Files/main.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"Source Files/main.d" -MT"Source\ Files/main.d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

Source\ Files/variables.o: ../Source\ Files/variables.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"Source Files/variables.d" -MT"Source\ Files/variables.d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


