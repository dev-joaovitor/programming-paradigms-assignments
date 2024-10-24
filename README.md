# Programming Paradigms

This repository is meant to store my code assignments from the college programming paradigms classes.

## Projects

### [1. Taxes](#1-taxes-1)
### [2. Bar](#2-bar-1)
### [3. Athletes](#3-athletes-1)
---

### 1. Taxes

#### Summary

The purpose of this program is to generate a tax report based on a person monthly income.

#### What should it do?

##### Input/Output
- [x] Read annual salary income
- [x] Read provision of services income
- [x] Read capital gain
- [x] Read educational expenses
- [x] Read medical expenses
- [x] Display the report

##### Tax Report
- [x] Calculate monthly salary income
- [x] Calculate salary tax rate
- [x] Calculate salary tax
- [x] Calculate services provisioning tax
- [x] Calculate capital gain tax
- [x] Calculate gross taxes
- [x] Calculate maximum deductible amount
- [x] Calculate deductible expenses
- [x] Calculate deduction to be applied
- [x] Apply deduction on gross tax

#### How to run?
```sh
cd ./taxes/src
javac Taxes.java
java Taxes
```
#### Java Version
```
java version "1.8.0_401"
Java(TM) SE Runtime Environment (build 1.8.0_401-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.401-b10, mixed mode)
```
###### [Back to projects](#projects)
---

### 2. Bar

#### Summary
The purpose of this program is to generate a payment report based on customer's consumption at a bar.

#### What should it do?

##### Input/Output
- [x] Read the customer sex
- [x] Read the beers consumed by the customer
- [x] Read the sodas consumed by the customer
- [x] Read the skewers consumed by the customer
- [x] Display the report

##### Payment Report
- [x] If the customer's sex is "male", the ticket will cost R$10.00, if it's "female", it will ost R$8.00  
- [x] Calculate the total consumption adding the beers, sodas and skewers consumed by the customer
- [x] If the consumption is over R$30.00, the couvert is free, else, it's R$4.00
- [x] Sum the total fees

#### How to run?
```sh
cd ./bar/src
javac Bar.java
java Bar
```
#### Java Version
```
java version "1.8.0_401"
Java(TM) SE Runtime Environment (build 1.8.0_401-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.401-b10, mixed mode)
```
###### [Back to projects](#projects)
---

### 3. Athletes

#### Summary
The purpose of this program is to register athletes and their measurements and generate a general measurements report.

#### What should it do?

##### Input/Output
- [x] Read the amount of athletes that will be registered (should be a positive non-zero integer)
- [x] Read the name of each athlete
- [x] Read the sex of each athlete (should be M for male or F for female)
- [x] Read the height of each athlete (should be a positive non-zero number)
- [x] Read the weight of each athlete (should be a positive non-zero number)
- [x] Display the report

##### Measurements Report
- [x] Calculate the athletes average weight (Men and women)
- [x] Find the highest athlete (Men or women)
- [x] Calculate the percentage of registered men
- [x] Calculate the women average height (If there are no women, display a message)

#### How to run?
```sh
cd ./athletes/src
javac -cp . AthletesProgram.java
java AthletesProgram
```
#### Java Version
```
java version "1.8.0_401"
Java(TM) SE Runtime Environment (build 1.8.0_401-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.401-b10, mixed mode)
```
