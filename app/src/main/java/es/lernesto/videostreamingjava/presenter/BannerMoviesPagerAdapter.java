package es.lernesto.videostreamingjava.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

import es.lernesto.videostreamingjava.MainActivity;
import es.lernesto.videostreamingjava.R;
import es.lernesto.videostreamingjava.model.BannerMovies;

public class BannerMoviesPagerAdapter extends PagerAdapter {

    Context context;
    List<BannerMovies> bannerMoviesList;

    public BannerMoviesPagerAdapter(Context context, List<BannerMovies> bannerMoviesList) {
        this.context = context;
        this.bannerMoviesList = bannerMoviesList;
    }

    @Override
    public int getCount() {
        return bannerMoviesList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_movie_layout, null);
        ImageView banner_image = view.findViewById(R.id.imageView_banner);

        Glide.with(context).load(bannerMoviesList.get(position).getURL_image()).into(banner_image);
        container.addView(view);
        return view;
    }
}
