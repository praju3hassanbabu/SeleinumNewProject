$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/cases/alex.feature");
formatter.feature({
  "name": "Test Me App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Product In Test Me App",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Alex login as admin",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudy_1.alex_login_as_admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Add a Product with all credentials filled",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudy_1.add_a_Product_with_all_credentials_filled()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "In Customers Home page should display product",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy_1.in_Customers_Home_page_should_display_product()"
});
formatter.result({
  "status": "skipped"
});
});