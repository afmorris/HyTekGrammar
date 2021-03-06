﻿using System;

namespace HyTekLanguageApplication.DataModels
{
    public class Meet
    {
        public string Name { get; set; }
        public DateTime Date { get; set; }
        public string Location { get; set; }

        public override string ToString()
        {
            return $"{this.Name} | {this.Date:g} | {this.Location}";
        }
    }
}