﻿// --------------------------------------------------------------------------------------------------------------------
// <copyright file="PerformanceView.cs" company="OhioTrackStats.com">
//   Copyright (c) 2018-2018 OhioTrackStats.com.
//   All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using ServiceStack.DataAnnotations;

namespace HyTekLanguageApplication.Models
{
    public class PerformanceView
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string School { get; set; }
        public double Data { get; set; }
        public string Division { get; set; }

        [Ignore]
        public PerformanceData PerformanceData { get; set; }
    }
}