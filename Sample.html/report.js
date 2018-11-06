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
  "rows": [
    {
      "cells": [
        "ff",
        "http://server/bank/"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on admintab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter username, password",
  "rows": [
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter the staff details",
  "rows": [
    {
      "cells": [
        "name11",
        "16JUN2011",
        "married",
        "16062018",
        "Line11",
        "6566598752",
        "dsds4545@gmail.com",
        "215dfd"
      ],
      "line": 12
    },
    {
      "cells": [
        "name2",
        "16JLY2011",
        "married",
        "16072018",
        "Line2",
        "6566458752",
        "dsds4895@gmail.com",
        "255dfd"
      ],
      "line": 13
    },
    {
      "cells": [
        "name3",
        "17JLY2011",
        "married",
        "16082018",
        "Line3",
        "6566455652",
        "dsds4125@gmail.com",
        "289dfd"
      ],
      "line": 14
    },
    {
      "cells": [
        "name4",
        "18JLY2011",
        "married",
        "20082018",
        "Line4",
        "6566455122",
        "dsds8925@gmail.com",
        "212dfd"
      ],
      "line": 15
    },
    {
      "cells": [
        "name5",
        "19JLY2011",
        "married",
        "20092018",
        "Line5",
        "6566480122",
        "dsds8505@gmail.com",
        "259dfd"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TC02_testcase.openbrowser(DataTable)"
});
formatter.result({
  "duration": 68767732264,
  "status": "passed"
});
formatter.match({
  "location": "TC02_testcase.navigateToAdmintab()"
});
formatter.result({
  "duration": 6055939062,
  "status": "passed"
});
formatter.match({
  "location": "TC02_testcase.usernameandpassword(DataTable)"
});
formatter.result({
  "duration": 3115316211,
  "status": "passed"
});
formatter.match({
  "location": "TC02_testcase.Givestaffdetails(DataTable)"
});
