package es.lernesto.videostreamingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import es.lernesto.videostreamingjava.model.BannerMovies;
import es.lernesto.videostreamingjava.presenter.BannerMoviesPagerAdapter;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout tabLayout;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> bannerMoviesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1,"Title","https://i.pinimg.com/736x/b6/d1/cd/b6d1cd6ae1a0ff462a01866750ce7c3b.jpg",""));
        bannerMoviesList.add(new BannerMovies(2,"Title 2","https://img.freepik.com/vector-premium/diseno-vector-fondo-cartel-pelicula-pelicula-cine_475148-387.jpg?w=360",""));
        bannerMoviesList.add(new BannerMovies(3,"Title 3","https://img.freepik.com/vector-premium/bienvenido-al-cartel-cine-ilustracion-vector-dibujos-animados-cartel-proyector-pelicula-retro-ilustracion-vector-dibujos-animados_189959-260.jpg?w=2000",""));
        bannerMoviesList.add(new BannerMovies(4,"Title 4","https://img.freepik.com/premium-vector/movie-film-banner-design-template-cinema-background-concept-cinema-concept-with-popcorn-filmstrip-film-clapper-yellow-background-vector-illustration_34230-852.jpg?w=2000",""));
        bannerMoviesList.add(new BannerMovies(5,"Title 5","https://images.all-free-download.com/images/graphiclarge/movie_festive_banner_dynamic_decor_flat_classic_6848466.jpg",""));
    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){
        bannerMoviesViewPager = findViewById(R.id.banner_viewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);

    }
}