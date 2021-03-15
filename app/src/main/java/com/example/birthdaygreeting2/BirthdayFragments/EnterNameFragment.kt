package com.example.birthdaygreeting2.BirthdayFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.birthdaygreeting2.R
import kotlinx.android.synthetic.main.fragment_enter_name.*

class EnterNameFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewButton.setOnClickListener {
            val name = nameEditText.text.toString()
            if(name.isEmpty())
                Toast.makeText(context, "Name is empty", Toast.LENGTH_SHORT).show()
            else {
                findNavController().navigate(EnterNameFragmentDirections.actionEnterNameFragmentToDisplayNameFragment(
                    name
                ))
            }
        }
    }
}