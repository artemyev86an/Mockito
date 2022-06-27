package ru.netology.manager;

public class FilmsManager {
    private String[] movies = new String[0];
    private  int limit;

    public FilmsManager() {  // limit = 10
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;

    }

    public void add(String film) {

        String[] tmp = new String[movies.length + 1];
        if (limit > movies.length) {
            for (int i = 0; i < movies.length; i++) {
                tmp[i] = movies[i];
            }
            tmp[tmp.length - 1] = film;
            movies = tmp;
        }
    }

    public String[] findAll() {
        return movies;


    }

    public String[] findLast() {
        String[] ans;
        if (movies.length > limit) {
            ans = new String[limit];
        } else {
            ans = new String[movies.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - i - 1];
        }
        return  ans;
    }
}
