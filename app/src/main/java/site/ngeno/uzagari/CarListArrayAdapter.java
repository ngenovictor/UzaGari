package site.ngeno.uzagari;


import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class CarListArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private List<String[]> mCarsArray;

    public CarListArrayAdapter(Context mContext, int resource, List<String[]> carsArray){
        super(mContext, resource);
        this.mContext = mContext;
        this.mCarsArray = carsArray;
    }

    @Override
    public Object getItem(int position) {
        String[] car = mCarsArray.get(position);
        String name = car[0];
        String price = car[1];
        return name + " at KSH."+ price ;

    }
    @Override
    public int getCount(){
        return mCarsArray.size();
    }

    public String getName(int position){
        String[] car = mCarsArray.get(position);
        return  car[0];
    }
    public String getPrice(int position){
        String[] car = mCarsArray.get(position);
        return car[1];
    }
    public String getPicture(int position){
        String[] car = mCarsArray.get(position);
        return  car[0];
    }
}
