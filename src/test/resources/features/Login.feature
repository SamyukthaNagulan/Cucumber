@LoginFeature @Sanity
  Feature: LoginFeature
    Background:
      User navigates to amazon
      Given I am on amazon login page

      @Test1
      Scenario: Verify login fails with incorrect credentials
        When I enter username as "tom@gmail.com"
        And I enter password as "jerry"
        Then Login should fail
        And this is a test

#        @Test2
#        Scenario: Verify login succeeds with correct credentials
#          When I enter username as "Tom"
#          And I enter password as "Jerry"
#          Then Login should succeed