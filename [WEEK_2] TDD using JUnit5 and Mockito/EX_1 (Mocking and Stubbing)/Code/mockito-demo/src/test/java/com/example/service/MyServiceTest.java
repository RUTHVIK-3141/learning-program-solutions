package com.example.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create a mock of the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub getData() to return a fixed value
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject the mock into your service
        MyService service = new MyService(mockApi);

        // 4. Call the method under test
        String result = service.fetchData();

        // 5. Verify the result
        assertEquals("Mock Data", result);

        // (Optional) verify that getData() was called exactly once
        verify(mockApi, times(1)).getData();
    }
}
