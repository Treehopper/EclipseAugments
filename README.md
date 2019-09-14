EclipseAugments
===================
Collection of tools meant to improve efficiency and effectiveness of Eclipse as an IDE. Some of these tools may be experimental or only make sense with a certain development workflow.

![Travis CI](https://api.travis-ci.org/Treehopper/EclipseAugments.svg "Build Status")


## Stack Trace Editor
### Features
* Folding of Java Stack Traces

## Part Detacher
### Features
* Detach an editor (such as the Compare Editor) from its stack and maximize it over multiple screens
* Re-attach editor to its previous stack
* Currently can only be Trigger using the context menu of an editor

## Hexadecimal Editing Augments
### Features
* Quick fix convert for JDT
* Tooltip convert for JDT
* JCT Debug variable value formatter

## Module Builder
### Features
* Wizard for configuring a set of Eclipse plug-Ins
* Generate separate model, UI and core bundles
* Generate p2 update site
* Generate tycho build, with dedicated target platform file
* Re-generate
    - Pre-fill wizard using selected plug-in project
    - Pre-fill wizard using selected persisted config

![alt tag](https://cloud.githubusercontent.com/assets/498968/14920455/09825276-0e2e-11e6-8cc9-5bcb4898ebb4.png)

## Git Mine
### Features
* Cycle through the history of the content of a file
* Show commit statistic on a file

## Preference Augments
### Features
* Increase memory available to Eclipse
* Make essential update sites available to the install dialog

## Scratchpad
### Features
* Access notes from within Eclipse
* Manage notes in files and folders

## Gister
### Features
* Create GitHub Gist from (right-click menu)
    - file selection, e.g in project explorer
    - text selection in editors
* Configure personal GitHub token in preferences

## XSD EMF Tools
### Features
* Generate ECore from XSD (right-click menu)

## m2-connectors
### jandex-maven-plugin m2e connector
m2e connector for the jandex maven plugin. Currently only handles the _jandex_ goal of the [jandex-maven-plugin](https://github.com/wildfly/jandex-maven-plugin).


Install from p2 update site
===================
http://treehopper.github.io/EclipseAugments/


License
===================
Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html

