﻿// --------------------------------------------------------------------------------------------------------------------
// <copyright file="AthletePerformance.cs" company="OhioTrackStats.com">
//   Copyright (c) 2018-2018 OhioTrackStats.com.
//   All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using OhioTrackStats.DataModels;
using ServiceStack.DataAnnotations;

namespace HyTekLanguageApplication.Models
{
    /// <summary>
    /// Represents the relationship between an athlete and a performance.
    /// </summary>
    public class AthletePerformance : BaseRecord
    {
        /// <summary>
        /// Gets or sets the athlete's identifier.
        /// </summary>
        public Guid AthleteId { get; set; }

        /// <summary>
        /// Gets or sets the performance's identifier.
        /// </summary>
        public Guid PerformanceId { get; set; }

        [Reference]
        public Athlete Athlete { get; set; }

        [Reference]
        public Performance Performance { get; set; }
    }
}