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

## Sirius

### How to see graphical syntax

1. Open CurriculumVitae.aird located in cv_model/model/CurriculumVItae.aird. 
2. Double click Curriculum_Vitae in Representations and choose the .xmi file.

The design file is called cv.odesign and is located in sirius/description/cv.odesign.

### Graphical to metamodal elements

The image [Graphical to metamodel](/Assignment/docs/cgsMapping.png) indicates with a number the connection between the metamodel and the tables of the graphical syntax.

![Concrete Graphical Syntax Example](/Assignment/docs/Curriculum_Vitae_graph_syntax.png)

## Acceleo (Code Generation)

### How to generate the latex file

1. Go to **/gen_tex/src/gen_tex/**, right click generate.mtl and then find "Run As" and go to Run Configurations.

2. Then input the configurations as shown in the image below: 

    ![Run Configuration for acceleo](/Assignment/docs/accRunConfig.png)

3. The underlined configuration represents the model in the .xmi format through which the code generation will be done. To generate another model its path needs to be input there.

4. After running the code generator, the generated latex file and its dependencies will be found in the **/gen_tex/output** path.