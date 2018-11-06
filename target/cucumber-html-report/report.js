$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is design to validate the Home page Functnationalities with",
  "description": "the below listed scenarios",
  "id": "this-feature-file-is-design-to-validate-the-home-page-functnationalities-with",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "This scenario is to validate the secure login, Username, password, and Login in functionalities.",
  "description": "",
  "id": "this-feature-file-is-design-to-validate-the-home-page-functnationalities-with;this-scenario-is-to-validate-the-secure-login,-username,-password,-and-login-in-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on admintab",
  "keyword": "And "
});
formatter.match({
  "location": "TC02_testcase.openbrowser()"
});
formatter.result({
  "duration": 8435721528,
  "status": "passed"
});
formatter.match({
  "location": "TC02_testcase.navigateToAdmintab()"
});
formatter.result({
  "duration": 848927846,
  "status": "passed"
});
});