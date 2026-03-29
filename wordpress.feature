Feature: WordPress Test

Scenario: Validate WordPress flow
  Given user launches WordPress site
  Then verify title
  When user clicks Get WordPress
  Then verify heading text
  When user navigates to photo directory
  And search for image "nature"
  Then verify images displayed
