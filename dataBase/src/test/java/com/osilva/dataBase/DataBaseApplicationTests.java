package com.osilva.dataBase;


/*@RunWith(SpringRunner.class)
@SpringBootTest*/
class DataBaseApplicationTests {

    /*private static final String USER_LOGIN =  "unitTestUserLogin";
    private static final String USER_PASSWORD = "unitTestUserPassword";
    private static final String USER_NAME = "unitTestUserName";

    @Autowired
    UserRepository userRepository;

    @Test
    public void insertUser(){

        User user = userRepository.save(
                User.builder()
                .setLogin(USER_LOGIN)
                .setName(USER_NAME)
                .setPassword(USER_PASSWORD)
                .build());

        assertThat("Didn't generate id", user.getId(), greaterThan(-1L));
        assertThat("Login didn't match", user.getLogin(), is(USER_LOGIN));
        assertThat("Password didn't match", user.getPassword(), is(USER_PASSWORD));
        assertThat("Name didn't match", user.getName(), is(USER_NAME));
    }*/

}
