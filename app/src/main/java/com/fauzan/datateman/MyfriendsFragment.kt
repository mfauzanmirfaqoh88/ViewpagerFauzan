package com.fauzan.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyfriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Muhammad Fauzan Mirfaqoh", "Laki-laki", "mfauzanmirfaqoh88@gmail.com",
        "083129335453", "Sidoarjo")
        )
        listTeman.add(
            MyFriend("ZANe", "Laki-laki", "zane23102001@gmail.com",
        "083129335453", "Sidoarjo")
        )
        listTeman.add(
            MyFriend("Alfa", "Premepuan", "alfaalfabet01@gmail.com",
        "085126339663", "Distrik 01")
        )
        listTeman.add(
            MyFriend("Bravo", "Laki-laki", "bravoalfa04@gmail.com",
        "081627664321", "Distrik 04")
        )
        listTeman.add(MyFriend("Charlie", "Laki-laki", "charlote13@gmail.com",
        "083344422178", "Distrik 13"))
        listTeman.add(MyFriend("Delta", "Perempuan", "deltatoalfa86@gmail.com",
        "083176453726", "Distrik 86"))
        listTeman.add(MyFriend("Echo", "Perempuan", "econommy666@gmail.com",
        "085342867187", "Distrik 666"))
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}