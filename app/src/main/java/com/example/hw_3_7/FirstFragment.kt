package com.example.hw_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw_3_7.databinding.FragmentFirstBinding
import java.text.FieldPosition

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var sonkList = arrayListOf(
        Prise("https://gagaru.club/uploads/posts/2023-02/1677023047_gagaru-club-p-kotiki-milie-risunki-legkie-krasivo-59.jpg","поставте", "???"),
        Prise("https://i.pinimg.com/236x/6e/6f/fe/6e6ffedd80a45c2d404638c5f29f689f.jpg","10", "???"),
        Prise("https://s0.tchkcdn.com/g-C9drvEFMZ9orcKE2BFvwLw/4/13995/1200x630/f/0/3c40c7483adb1b0161842f354b27e689_08.jpg","пожалуйста", "???"),
    )
    private val bundle = Bundle()
    private val sekondFragment : SekondFragment = SekondFragment()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PriseAdapter(sonkList,this::onClick)
        binding.rvPrise.adapter = adapter
    }
    fun onClick(position: Int) {
        bundle.putSerializable("sd", sonkList[position])
        sekondFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.second_container,sekondFragment).addToBackStack(null).commit()
    }
}