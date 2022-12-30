# Assignment 

## First metamodel version

### 1. Modelling Domain Analysis

For the domain analysis of the project we explored various websites containing different CVs. Through this research we developed a table representing the concepts, its explicit definitions and intrinsic and extrinsic properties, in order to better conceptualize the metamodel to be implemented.
This table can be found in the following link: [Modeling concept table (1st version)](/Assignment/docs/MDAfirst.pdf).

### 2. Modelling Language Design 

For the modelling language design we used the emf framework with auxiliary OCL constraints that, in our case were mainly used to guarantee that scales didn't deviate from its possible values. 
For example language qualifications can only have the following values as inputs: A1, A2, B1, B2, C1 and C2.

The resulting metamodel diagram was the following ([First Metamodel diagram link](/Assignment/docs/MetamodelFirst.jpg)):

![First Metamodel diagram](/Assignment/docs/MetamodelFirst.jpg)

## Second metamodel version

### 1. Modelling Domain Analysis

For the second phase of the project slight changes were done, such as the removal and renaming of some attributes that were found to be inadequate and also the creation of 1 necessary attribute related to the idioms spoken (whether or not the idiom is native language). These are reflected in the following link's table: 
[Modeling concept table (2nd version)](/Assignment/docs/MDAsecond.pdf).

### 2. Modelling Language Design
The previously described changes are reflected in the following metamodel diagram ([Second Metamodel diagram link](/Assignment/docs/MetamodelSecond.png)):

![Second Metamodel diagram](/Assignment/docs/MetamodelSecond.png)