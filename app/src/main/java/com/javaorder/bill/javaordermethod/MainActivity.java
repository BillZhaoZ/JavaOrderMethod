package com.javaorder.bill.javaordermethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主界面
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bubble_sort)
    Button mBubbleSort;
    @BindView(R.id.choose_sort)
    Button mChooseSort;
    @BindView(R.id.half_sort)
    Button mHalfSort;
    @BindView(R.id.sort_display_before)
    TextView mSortDisplayBefore;
    @BindView(R.id.sort_display_after)
    TextView mSortDisplayAfter;
    @BindView(R.id.delete)
    Button mDelete;

    private SortMethod mMethod;
    private int[] mArr;
    private StringBuffer mBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initView();
    }

    /**
     * 初始化
     */
    private void initView() {
        mMethod = new SortMethod();
        mBuffer = new StringBuffer();

        mArr = new int[]{45, 38, 65, 97, 76, 13, 27, 49};

        for (int i1 : mArr) {
            mBuffer.append(i1);
            mBuffer.append(",");
        }

        mSortDisplayBefore.setText("排序前：" + mBuffer);
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @OnClick({R.id.bubble_sort, R.id.choose_sort, R.id.half_sort, R.id.insert_sort})
    public void onViewClicked(View view) {

        switch (view.getId()) {

            // 冒泡排序
            case R.id.bubble_sort:
                mBuffer.delete(0, mBuffer.length());
                int[] bubbleSort = mMethod.bubbleSort(mArr);

                for (int i : bubbleSort) {
                    mBuffer.append(i);
                    mBuffer.append(",");
                }

                mSortDisplayAfter.setText("排序后：" + mBuffer);
                break;

            // 选择排序
            case R.id.choose_sort:
                int[] chooseSort = mMethod.chooseSort(mArr);

                for (int i : chooseSort) {
                    mBuffer.append(i);
                    mBuffer.append(",");
                }

                mSortDisplayAfter.setText("排序后：" + mBuffer);
                break;

            // 插入排序
            case R.id.insert_sort:
                int[] insertSort = mMethod.insertSort(mArr);

                for (int i : insertSort) {
                    mBuffer.append(i);
                    mBuffer.append(",");
                }

                mSortDisplayAfter.setText("排序后：" + mBuffer);

                break;

            case R.id.half_sort:

                break;
        }
    }

    /**
     * 清除排序后的数据
     */
    @OnClick(R.id.delete)
    public void onViewClicked() {
        mBuffer.delete(0, mBuffer.length());
        mSortDisplayAfter.setText("排序后：" + mBuffer);
    }
}
