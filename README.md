# markdown2html
The purpose of this project is to explore how [Xtext](https://eclipse.org/Xtext/) works, by making a DSL for [Github markdown](https://guides.github.com/features/mastering-markdown/), and finally generate HTML from the markdown.

## Getting started
* Install pre-configured Eclipse with Xtext from [here](https://eclipse.org/Xtext/download.html).
* Clone this repo.
* Start Eclipse, go to File -> Import, and choose General -> Existing project into workspace. In next step, select the root directory of the repo.

## How it works
* The language is defined in the file markdown2html\org.xtext.example.markdown\src\org\xtext\example\markdown\Markdown.xtext. This file defines how markdown text should be mapped to our model objects. To generate xtext-stuff from the model, right-click on the file in the package explorer, and select Run as -> Generate Xtext artifacts.
* The HTML-text is generated by the MarkdownGenerator, org.xtext.example.markdown\src\org\xtext\example\markdown\generator\MarkdownGenerator.xtend
* If you want to test the DSL, right click on the package org.xtext.markdown in the package explorer and select Run as -> Eclipse application. In the new Eclipse window, go to  File -> New -> Java project, and choose a name for the project. Add a new file to the source folder with file ending .markdown, e.g test.markdown. Then you are asked if you want to add Xtext nature to your project, and you want that. In the new file, start typing markdown text. Every time you save the file with valid text, the file src-gen/markdown.html vil contain the resulting HTML.
* The file ParserTest in org.xtext.example.markdown.tests\src\org\xtext\example\markdown\tests shows how you can test that the parser works as intended.

## Make it better
Implement support for 
* Remaining headings
* Links
* Lists
* Tables

Write tests
* Write more tests in the ParserTest class as you implement more functionality
* Write test for the final html output
