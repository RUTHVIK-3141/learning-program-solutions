import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyServiceTest {

    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("hello");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("hello", result);  

        verify(mockApi, times(1)).getData();
    }
}
