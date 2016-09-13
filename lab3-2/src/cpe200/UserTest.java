package cpe200;

import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by pruet on 6/9/2559.
 */
public class UserTest {
    protected User user;
    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void setUserNameValid() throws Exception {
        assertTrue(user.setUserName("harrypotter"));
        assertTrue(user.setUserName("kinggeorge3"));
        assertTrue(user.setUserName("i5554321"));
        assertTrue(user.setUserName("HarryPotter"));
    }

    @Test
    public void setUserNameInValid() throws Exception {
        assertFalse(user.setUserName("harry")); // short
        assertFalse(user.setUserName("15554321")); // all number
        assertFalse(user.setUserName("5tormer5")); // lead with number
        assertFalse(user.setUserName("harry-potter")); // with symbol
    }

    @Test
    public void setPasswordValid() throws Exception {
        assertTrue(user.setPassword("A123456789012a"));
        assertTrue(user.setPassword("1Abcdefghijklmn"));
        assertTrue(user.setPassword("Abcd12345abcd"));
    }

    @Test
    public void setPasswordInvalid() throws Exception {
        assertFalse(user.setPassword("Abcd1")); // short
        assertFalse(user.setPassword("Abcdefghtijk")); // no number
        assertFalse(user.setPassword("abcdefghtijk123")); // no capital
        assertFalse(user.setPassword("ABCDEFGHIJK123")); // no small
    }

    @Test
    public void getUserName() throws Exception {
        user.setUserName("harrypotter");
        assertEquals("harrypotter", user.getUserName());
    }

    @Test
    public void getPassword() throws Exception {
        user.setPassword("1Abcdefghijklmn");
        assertEquals("1Abcdefghijklmn", user.getPassword());

    }

}