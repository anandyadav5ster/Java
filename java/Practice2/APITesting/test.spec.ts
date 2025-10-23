import { test, expect } from '@playwright/test';
import { APIResponse } from '@playwright/test';

test('Verify successful API status code', async ({ request }) => {
    // Make the API call and get the response object
    const response: APIResponse = await request.get('https://api.example.com/data');

    // Parse and store the response body as a JSON object
    const responseBody = await response.json();
    
    // The responseBody variable now holds the API response data
    console.log(responseBody);
});