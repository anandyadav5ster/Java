
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver import Chrome
import pytest

from selenium.webdriver.common.by import By



locators = {
        "ShirtInputbox": ('XPATH', '//input[@id = "searchInputId"]'),
        "ShirtSizeSmall": ('XPATH', '//li[@data-option = "small"]'),
        "btnSignIn": ('NAME', '//input[@value="Log In"]')
    }

import time


# This is used to skip the test case
#@pytest.mark.skip("Don't want to execute")



class Test:
    def test_registration_valid_data(self,):
        self.driver.get("https://www.thetestingworld.com/testings/")
        self.driver.maximize_window()
        assert self.driver.title == "Login & Sign Up Forms"

    # @pytest.mark.Sanity
    def test_registration_Invalid_data(self):
        self.driver.get("https://www.thetestingworld.com/testings/")
        self.driver.maximize_window()
        assert self.driver.current_url == "https://www.thetestingworld.com/testings/"


    # @pytest.mark.Smoke
    def test_1(self):
        self.driver.get("https://www.thetestingworld.com/testings/")
        self.driver.maximize_window()

    # @pytest.mark.Smoke
    def test_2(self):
        self.driver.get("https://www.thetestingworld.com/testings/")
        self.driver.maximize_window()

    def test_3(self):
        self.driver.get("https://www.thetestingworld.com/testings/")
        self.driver.maximize_window()

    @pytest.mark.jcpenney
    def test_4(self):
        self.driver.implicitly_wait(10)
        self.driver.get("https://www.jcpenney.com/")
        self.driver.maximize_window()
        self.driver.find_element(By.XPATH,'//input[@id = "searchInputId"]').send_keys("Shirt")
        self.driver.find_element(By.XPATH,"//button[@title= 'search']").click()
        time.sleep(10)
        self.driver.find_element(By.XPATH,"(//img[contains(@loading,'lazy')])[1]").click()
        # driver.find_element_by_xpath("(//select[@data-automation-id = 'product-dimensions-size'])[1]").click()
        self.driver.find_element(By.XPATH,'//li[@data-option = "small"]').click()
        time.sleep(10)
        self.driver.find_element(By.XPATH,"(//p[@data-automation-id = 'addToCart'])[1]").click()
        self.driver.find_element(By.XPATH,"(//button[@data-automation-id= 'at-panel-checkout-button'])[1]").click()
        self.driver.find_element(By.XPATH,"(//select[@data-automation-id= 'at-select-quantity'])[1]").click()
        self.driver.find_element(By.XPATH,"(//option[@value = '2'])[1]").click()
        time.sleep(2)



